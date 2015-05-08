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
            modelWithError.text = 'Pasa como parametro un name'
            modelWithError.from = 'redirect'
            path << 'before redirect'
            redirect(action: 'emptyParams', params: modelWithError)
            path << 'after redirect'
            if(params.return) {
                return
            }
        }

        if (!params.color) {
            modelWithError.text = 'Pasa como parametro un color'
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
                error: error
        ]

        error = null

        path << "end emptyParams from ${params.from}"

        model
    }
}
