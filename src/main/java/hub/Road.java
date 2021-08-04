package hub;

public class Road extends Stage{
    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000L);
            System.out.println(c.getName() + " закончил этап: " + description);

            if((MainClass.flag)&&(this.length == 40)){
                System.out.println(c.getName() + " Win");
                MainClass.flag = false;
            }
            if(this.length == 40) MainClass.cdFinish.countDown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
