package io.hashimati;


import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

@Controller("/")
public class IndexController {
    @Get("/")
    @View("index")
    public HttpResponse<?> index(){
        return HttpResponse.ok();
    }

}
