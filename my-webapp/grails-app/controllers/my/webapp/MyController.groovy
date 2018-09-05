package my.webapp


class MyController {

    def index() {
        render plugin: 'my-plugin', template: '/template/hello'
    }

}
