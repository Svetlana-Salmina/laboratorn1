package p1;

public class SingleClubMember extends Member {

    private int club;
    SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pClub) {
        super(pMemberType, pMemberID, pName, pFees);


        club = pClub;
    }
    public int getClub(){
        return сlub;
}

    public void setСlub(int сlub) {
        this.сlub = сlub;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + club;
    }
}
