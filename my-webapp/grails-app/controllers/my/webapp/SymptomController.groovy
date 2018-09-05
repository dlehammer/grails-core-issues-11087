package my.webapp

class SymptomController {

    // expected to render: (my-plugin) /template/bar
    def index() {
        render plugin: 'my-plugin', template: '/template/bar'
    }

    // expected to render: /template/bar -> (my-plugin) /template/bar
    def bar() {
        render template: '/template/bar'
    }

    // expected to render: /template/foo -> (my-plugin) /template/bar
    def foo() {
        render template: '/template/foo'
    }

}
