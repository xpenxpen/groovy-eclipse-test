import groovy.json.JsonSlurper

class JsonTest {


    public static void main(String[] args) {
        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "name": "John Doe" } /* some comment */')

        assert object instanceof Map
        assert object.name == 'John Doe'
        println object.name
    }


}
