public enum Season {
    SPRING("wiosna", new String[] {"Marzec", "Kwiecień", "Maj"}),
    SUMMER("lato", new String[] {"Czerwiec", "Lipiec", "Sierpień"}),
    AUTUMN("jesień", new String[] {"Wrzesień", "Październik", "Listopad"}),
    WINTER("zima", new String[] {"Grudzień", "Styczeń", "Luty"});

    private final String description;
    private String[] months;

    Season(String description, String[] strings) {
        this.description = description;
        this.months = strings;
    }

    public String getDescription() {
        return description;
    }

    public String[] getMonths() {
        return months;
    }
}
