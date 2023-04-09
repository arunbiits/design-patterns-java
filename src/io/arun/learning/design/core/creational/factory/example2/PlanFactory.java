package io.arun.learning.design.core.creational.factory.example2;

public class PlanFactory {

    public Plan getPlan(String type) {
        if(type != null) {
            if(type.equals("domestic")) {
                return new DomesticPlan();
            } else if(type.equals("commercial")) {
                return new CommercialPlan();
            } else if(type.equals("institutional")) {
                return new InstitutionalPlan();
            }
        }
        return null;
    }

}
