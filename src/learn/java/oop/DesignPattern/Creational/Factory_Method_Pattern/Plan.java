package learn.java.oop.DesignPattern.Creational.Factory_Method_Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Plan {
    //    https://www.javatpoint.com/factory-method-design-pattern
    double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }

    public static class GetPlanFactory {
        //use getPlan method to get object of type Plan
        public Plan getPlan(String planType) {
            if (planType == null) {
                return null;
            }
            if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
                return new DomesticPlan();
            } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
                return new CommercialPlan();
            } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
                return new InstitutionalPlan();
            }
            return null;
        }
    }

    public static class InstitutionalPlan extends Plan {
        @Override
        void getRate() {
            rate = 5.50;
        }
    }

    public static class DomesticPlan extends Plan {
        @Override
        void getRate() {
            rate = 3.50;
        }
    }

    public static class GenerateBill {
        public static void main(String[] args) throws IOException {

            GetPlanFactory planFactory = new GetPlanFactory();

            System.out.print("Enter the name of plan for which the bill will be generated: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String planName = br.readLine();
            System.out.print("Enter the number of units for bill will be calculated: ");
            int units = Integer.parseInt(br.readLine());

            Plan p = planFactory.getPlan(planName);
            //call getRate() method and calculateBill()method of DomesticPaln.

            System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
            p.getRate();
            p.calculateBill(units);
        }
    }

    public static class CommercialPlan extends Plan {
        @Override
        void getRate() {
            rate = 7.50;
        }
    }
}
