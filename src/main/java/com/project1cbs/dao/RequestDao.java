package com.project1cbs.dao;

import com.project1cbs.exception.BookingIdNotFoundException;

public interface RequestDao {
 public void acceptRequest(Integer bookingReqId) throws BookingIdNotFoundException;
 public void rejectRequest(Integer bookingReqId)throws BookingIdNotFoundException;
}
