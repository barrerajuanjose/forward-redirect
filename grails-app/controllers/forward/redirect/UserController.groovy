package forward.redirect

class UserController {

    Exception error

    def index() {
        def model = [:]
        def modelWithError = [:]

        if (!params.name) {
            modelWithError.text = 'Pasa como parametro un name'
            forward(action: 'emptyParams', params: modelWithError)

            if(params.return) {
                return
            }
        }

        if (!params.color) {
            modelWithError.text = 'Pasa como parametro un color'
            redirect(action: 'emptyParams', params: modelWithError)

            if(params.return) {
                return
            }
        }

        try {
            model.name = params.name.capitalize()
            model.color = params.color.capitalize()
        } catch (e) {
            error = e
        }

        model
    }

    def emptyParams() {
        def model = [
                text: params.text,
                error: error
        ]

        error = null

        model
    }
}
