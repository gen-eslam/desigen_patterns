public class BuilderPattern {
    private Long id;
    private String name;
    private String address;
    private Long budget;
    private  Long discountRate;
    public static class Builder{
        private Long id;
        private String name;
        private String address;
        private Long budget;
        private  Long discountRate;
        public  Builder(Long id){
            this.id=id;
        }
        public Builder withName(String name ){
            this.name =name;
            return this;
        }
        public Builder withAddress(String address ){
            this.address =address;
            return this;
        }
        public Builder withBudget(Long budget){
            this.budget = budget;
            return this;
        }
        public Builder withDiscountRate(Long discountRate){
            this.discountRate=discountRate;
            return this;
        }
        public  BuilderPattern build(){
            BuilderPattern onlineStore = new BuilderPattern();
            onlineStore.id=this.id;
            onlineStore.name=this.name;
            onlineStore.address=this.address;
            onlineStore.budget=this.budget;
            onlineStore.discountRate=this.discountRate;
            return onlineStore ;
        }

    }
    private BuilderPattern(){};

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Long getBudget() {
        return budget;
    }

    public Long getDiscountRate() {
        return discountRate;
    }
}
