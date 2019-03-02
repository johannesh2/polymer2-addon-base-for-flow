package org.vaadin.johannes;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("my-custom-element")
@HtmlImport("bower_components/my-custom-element/my-custom-element.html")
public class MyComponent extends Component {

    public MyComponent() {
    }
}
