class MyCalendar {
    private List<Integer[]> bookings;

    public MyCalendar() {
        bookings = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        if (bookings.size() == 0) {
            bookings.add(new Integer[]{start, end});
            return true;
        } else {
            for (int i = 0; i < bookings.size(); i++) {
                Integer[] curBooking = bookings.get(i);
                if (start >= curBooking[0] && start < curBooking[1]) {
                    return false;
                }
                if (start < curBooking[0] && end > curBooking[0]) {
                    return false;
                }
            }
            bookings.add(new Integer[]{start, end});
            return true;
        }
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */