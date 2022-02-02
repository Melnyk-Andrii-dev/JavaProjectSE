package ua.intita.qa.innerClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoNestedClasses {
    public static void main(String[] args) {
        nestedOwner owner1 = new nestedOwner(5);
        nestedOwner owner2 = new nestedOwner(1);
        List<nestedOwner> owners = Arrays.asList(owner1, owner2);
        owners.sort(new nestedOwner.OwnerComparator());
        System.out.println(owners);

        Phone phone = new Phone.PhoneBuilder()
                .setId(1)
                .setModel("Galaxy")
                .setCompany("Samsung")
                .setCost(999)
                .setRem(8)
                .setDisplay(9.0)
                .setCountry("China")
                .build();
        System.out.println(phone);
    }
}
