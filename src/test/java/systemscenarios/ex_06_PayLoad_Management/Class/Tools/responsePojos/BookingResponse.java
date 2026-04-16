package systemscenarios.ex_06_PayLoad_Management.Class.Tools.responsePojos;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import systemscenarios.ex_06_PayLoad_Management.Class.Tools.requestPOJOs.Booking;

public class BookingResponse {

    @SerializedName("bookingid")
    @Expose
    private Integer bookingid;
    @SerializedName("booking")
    @Expose
    private Booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

}
