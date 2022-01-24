package course1.homework7;

public class Cat {
    private final String name;
    private final int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean satiety(Plate plate) {
        return plate.decreaseFood(appetite);
    }

    public void eat(Plate plate) {
        StringBuilder feedingInfo = new StringBuilder();
        boolean result = satiety(plate);
        if (result) {
            feedingInfo.append("Кот ")
                    .append(getName())
                    .append(" поел и он сыт");
            System.out.println(feedingInfo);
        } else if (getAppetite() >= 0) {
            int amountToFill = getAppetite() - plate.getFood();
            feedingInfo.append("Коту ")
                    .append(getName())
                    .append(" не хватило еды и он голоден")
                    .append("\nДобавим ему ")
                    .append(amountToFill)
                    .append("ед. еды.");
            System.out.println(feedingInfo);
            plate.fillPlate(amountToFill);
            eat(plate);
        } else {
            feedingInfo.append("У кота ")
                    .append(getName())
                    .append(" неверное значение аппетита");
            System.out.println(feedingInfo);
        }
    }

    public String getName() {
        return name;
    }
}
