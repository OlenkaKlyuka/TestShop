package pageElement;

import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;

public class PageDecorator extends DefaultFieldDecorator {

    public PageDecorator(ElementLocatorFactory factory) {
        super(factory);
    }

    @Override
    public Object decorate(ClassLoader loader, Field field) {

        ElementLocator locator = factory.createLocator(field);

        if (field.getType().isAssignableFrom(PageElement.class)) {
            final PageElement pageElement = new PageElement(proxyForLocator(loader, locator));
            if (field.isAnnotationPresent(Name.class)) {
                final Name annotationName = field.getAnnotation(Name.class);
                if (!annotationName.value().isEmpty()) {
                    pageElement.setName(annotationName.value());
                }
            }
            return pageElement;
        } else {
            return super.decorate(loader, field);
        }
    }
}