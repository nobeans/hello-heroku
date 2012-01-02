package hello.heroku

class Bookmark {

    String title
    String url
    String remarks

    static constraints = {
        title(blank:false)
        url(blank:false)
        remarks()
    }
}
