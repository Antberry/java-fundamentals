package inheritance;

public class Shop {
    private String name;
    private String description;
    private String numDollarSigns;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getNumDollarsigns() {
        return numDollarSigns;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumDollarsigns(String numDollarsigns) {
        this.numDollarSigns = numDollarsigns;
    }

    public Shop(String name, String description, String numDollarSigns){
        this.name = name;
        this.description = description;
        this.numDollarSigns = numDollarSigns;
    }

    public String toString(){
        return String.format("%s, %s, %s", this.name, this.numDollarSigns, this.description);
    }
}
