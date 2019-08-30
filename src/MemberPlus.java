public class MemberPlus extends Member {


    public MemberPlus(String firstName, String CPR) {
        super(firstName, CPR);
    }

    @Override
    public String getMemberType() {
        return "full";
    }

    @Override
    public int getFee() {
        return super.getFee() + 100;
    }

}