package p1;

public interface Calculator <T extends Member> {
    double calculateFees(T clubID);
}
