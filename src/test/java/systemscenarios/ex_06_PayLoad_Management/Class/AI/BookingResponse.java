package systemscenarios.ex_06_PayLoad_Management.Class.AI;

public class BookingResponse {
    private int bookingid;
    private Booking booking;

    // Getters & Setters
    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
