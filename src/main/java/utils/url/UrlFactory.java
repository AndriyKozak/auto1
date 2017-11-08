package utils.url;

import utils.PropertyManager;

public class UrlFactory {

    public static TypeOfUrl typeOfUrl;

    private UrlFactory() {
    }

    public static TypeOfUrl getUrl() {
        if (typeOfUrl == null) {
            switch (PropertyManager.getUrlType()) {
                case url1:
                    typeOfUrl = TypeOfUrl.url1;
                    break;
            }
        }
        return typeOfUrl;
    }
}
