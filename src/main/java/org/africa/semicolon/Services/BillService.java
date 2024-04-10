package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.Bill;
import org.africa.semicolon.Dtos.Requests.IssueBillRequest;
import org.springframework.stereotype.Service;

@Service
public interface BillService {
    Bill IssueBill(IssueBillRequest issueBillrequest);

    Bill GetBillDetails(IssueBillRequest issueBillRequest);
}