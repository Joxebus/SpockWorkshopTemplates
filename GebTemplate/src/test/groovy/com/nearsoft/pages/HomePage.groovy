package com.nearsoft.pages

import geb.Page

class HomePage extends Page {

    static url = "http://localhost:8090/"

    static at = { title == "Index Page" }

    static content = {
        selectors { $("#nav").find("a") }
        welcome { selectors[0] }
        about { selectors[1] }
    }
}
