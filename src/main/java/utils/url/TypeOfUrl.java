package utils.url;

public enum TypeOfUrl {
    url1("https://auto1.com/en/our-cars");

    private final String url;

    TypeOfUrl(String s) {
        url = s;
    }

    public String getUrl() {
        return url;
    }

    // @Override
    public String toString() {
        return url;
    }
}
