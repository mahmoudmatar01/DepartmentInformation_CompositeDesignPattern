package org.design_patterns;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationUnit{

    List<OrganizationUnit> organizationUnitList;

    public Department() {
        this.organizationUnitList = new ArrayList<>();
    }

    public void addOrganizationUnit(OrganizationUnit organizationUnit) {
        this.organizationUnitList.add(organizationUnit);
        System.out.println("Organization Unit Added!!");
    }

    @Override
    public double calculateTotalPrice() {
        return organizationUnitList.stream().mapToDouble(OrganizationUnit::calculateTotalPrice)
                .sum();
    }
}
