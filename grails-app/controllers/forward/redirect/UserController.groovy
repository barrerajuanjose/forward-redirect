package forward.redirect

class UserController {

    def path = []
    Exception error

    def index() {
        def model = [:]
        def modelWithError = [:]

        path = []

        path << 'index'

        if (!params.name) {
            modelWithError.text = 'Falta parametro "name"'
            modelWithError.from = 'redirect'
            path << 'before redirect'
            redirect(action: 'emptyParams', params: modelWithError)
            path << 'after redirect'
            if(params.return) {
                return
            }
        }

        if (!params.color) {
            modelWithError.text = 'Falta parametro "color"'
            modelWithError.from = 'forward'
            path << 'before forward'
            forward(action: 'emptyParams', params: modelWithError)
            path << 'after forward'
            if(params.return) {
                return
            }
        }

        try {
            model.name = params.name.capitalize()
            model.color = params.color.capitalize()
        } catch (e) {
            path << e
            error = e
        }

        path << 'end index'

        model.path = path

        model
    }

    def emptyParams() {
        path << "emptyParams from ${params.from}"
        def model = [
                text: params.text,
                path: path,
                error: error,
                from: params.from
        ]

        error = null

        path << "end emptyParams from ${params.from}"

        model
    }
}
