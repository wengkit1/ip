public class Deadline extends Tasks{
    String icon = "[D]";

    String desc;
    String end;
    public Deadline(String str) throws unspecTimeException {
        super(str);
        if ((super.getDesc().split("/", 2)).length == 1) {
            throw new unspecTimeException("Please specify a deadline (by/ ... )");
        }
        String time = super.getDesc().split("/", 2)[1];
        this.desc = super.getDesc().split("/",2)[0];
        this.end =  time.replaceFirst(" ", ": ");
    }
    public String icon() {
        return icon;
    }

    public String getDesc(){
        return this.desc+ "("+this.end+")";
    }

    public String mssg() {
        return super.mssg() + " " + this.icon + super.symbol() + " " + this.desc
                +"("+this.end+")";
    }
}
