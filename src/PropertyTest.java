package src;
public class PropertyTest {

    /*
    @Test
    public void sellHouseOrHotel() {
        Property temp = new Property(1, "Example Street", Group.GREEN, 10, 10, null, 10, null);
        temp.setHotelNo((temp.getHotelNo())++);
        temp.housesNo++;
        assertEquals(temp.sellHouseOrHotel(), 200);
        assertEquals(temp.sellHouseOrHotel(), 200);
        assertEquals(temp.sellHouseOrHotel(), 0);

        Property temp2 = new Property(1, "Example Street", Group.YELLOW, 10, 10, null, 10, null);
        temp2.hotelNo++;
        temp2.housesNo++;
        assertEquals(temp2.sellHouseOrHotel(), 150);
        assertEquals(temp2.sellHouseOrHotel(), 150);
        assertEquals(temp2.sellHouseOrHotel(), 0);
    }

    /*
    @Test
    public void isDeveloped(){
        Property temp = new Property(1, "Example Street", Group.GREEN, 10, 10, null, 10, );
        assertEquals(temp.developed, Boolean.FALSE);
        temp.purchaseHouse();
        assertEquals(temp.isDeveloped(), Boolean.TRUE);
        temp.addHotel();
        assertEquals(temp.isDeveloped(), Boolean.TRUE);
    }
    */


    /*
    @Test
    public void mortgageProperty() {
        Property temp = new Property(1, "Example Street", Group.GREEN, 10, 10, null, 10, null);
        temp.housesNo++;
        assertEquals(temp.mortgageProperty(),0);
        temp.sellHouseOrHotel();
        assertEquals(temp.mortgageProperty(),5);
        assertEquals(temp.mortgageProperty(),0);
    }



    @Test
    public void sellProperty() {
        Property temp1 = new Property(1, "Example Street", Group.GREEN, 10, 10, null, 10, null);
        assertEquals(temp1.sellProperty(), 10);
        assertNull(temp1.getOwner());

        Property temp2 = new Property(1, "Example Street", Group.GREEN, 10, 10, null, 10, null);
        temp2.hotelNo++;
        assertEquals(temp2.sellProperty(), 0);
        temp2.sellHouseOrHotel();
        assertEquals(temp2.sellProperty(), 10);

        Property temp3 = new Property(1, "Example Street", Group.GREEN, 10, 10, null, 10, null);
        temp3.mortgageProperty();
        assertEquals(temp3.sellProperty(), 5);
    }
    */

}