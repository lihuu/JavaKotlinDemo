module JavaKotlinDemo {
    requires kotlin.stdlib;
    requires lombok;
    requires org.mapstruct;
    requires java.compiler;

    exports demo.kotlin;
    exports demo.java.hello;
    exports demo.java.hello.converter;
    exports demo.java.hello.model;
}