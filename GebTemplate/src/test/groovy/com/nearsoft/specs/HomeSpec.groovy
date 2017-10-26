package com.nearsoft.specs

import geb.spock.GebSpec

class HomeSpec extends GebSpec {

    def "Navigate to Nearsoft Home Page"(){
        when:
        go "http://localhost:8090"

        then:

        title == "Index Page"

        and:

        def selectors = $("#nav").find("a")

        then:
        selectors.size() == 2

        and:
        selectors[1].click()

        then:
        title == "About Page 2"

    }
}
