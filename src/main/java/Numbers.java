public enum Numbers {

    One(1),
    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Six(6),
    Seven(7),
    Eight(8),
    Nine(9),
    Ten(10),
    Eleven(11),
    Twelve(12),
    Thirteen(13),
    Fourteen(14),
    Fifteen(15),
    Sixteen(16),
    Seventeen(17),
    Eighteen(18),
    Nineteen(19),
    Twenty(20),
    Thirty(30),
    Forty(40),
    Fifty(50),
    Sixty(60),
    Seventy(70),
    Eighty(80),
    Ninety(90);

    Integer number;

    Numbers(Integer number){
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
