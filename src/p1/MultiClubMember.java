package p1;

public class MultiClubMember extends Member{

    private int membershipPoints;
    MultiClubMember (char pMemberType, int pMemberID, String pName, double pFees, int pMembershipPoints) {
        super(pMemberType, pMemberID, pName, pFees);
        membershipPoints = pMembershipPoints;
    }
    public int getMembershipPoints()
    {
    return membershipPoints;
    }
    public void setMembershipPoints(int pMembershipPoints) {
        membershipPoints = pMembershipPoints;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + membershipPoints;

}
}

