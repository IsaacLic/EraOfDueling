package org.StrategyGame.units;

public class UnitBuilder {
    public static <T extends Unit> T createUnit(UnitCategory<T> unitCategory) {
        return unitCategory.createInstance();
    }
}