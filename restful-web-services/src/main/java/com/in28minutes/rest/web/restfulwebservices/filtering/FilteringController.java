package com.in28minutes.rest.web.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class View{
    public interface View1{

    }
    public interface View2{

    }
}

//@JsonIgnoreProperties("value1")
class SomeBean{

    @JsonView(View.View1.class)
    private String value1;

//    @JsonIgnore
    @JsonView(View.View2.class)
    private String value2;

    @JsonView({View.View1.class,View.View2.class})
    private String value3;

    SomeBean(String value1,String value2,String value3){
        super();
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    public String getValue3() {
        return value3;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                '}';
    }
}

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean filterinrg(){
        return new SomeBean("value1","value2","value3");
    }

    @GetMapping("/filtering-with-view1")
    @JsonView(View.View1.class)
    public SomeBean filterinrgWithView1(){
        return new SomeBean("value1","value2","value3");
    }

    @GetMapping("/filtering-with-view2")
    @JsonView(View.View2.class)
    public SomeBean filterinrgWithView2(){
        return new SomeBean("value1","value2","value3");
    }
}
