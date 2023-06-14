//package com.keycloakplayground.service;
//
//import com.keycloakplayground.entity.DomesticTransfer;
//import com.keycloakplayground.repository.CustomerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.UUID;
//
//@Service
//public class DomesticTransferService {
//
//    @Autowired
//    private CustomerRepository customerRepository;
//
//    /**
//     * Retrieves all domestic transfers.
//     *
//     * @return List of all domestic transfers
//     */
//    public List<DomesticTransfer> getAllDomesticTransfers(){
//        return customerRepository.findAll();
//    }
//
//    /**
//     * Creates a new domestic transfer.
//     *
//     * @param domesticTransfer the domestic transfer to be created
//     * @return the created domestic transfer
//     */
//    public DomesticTransfer createDomesticTransfer(DomesticTransfer domesticTransfer) {
//        customerRepository.save(domesticTransfer);
//        return domesticTransfer;
//    }
//
//    /**
//     * Deletes a domestic transfer by its ID.
//     *
//     * @param domesticTransferTrxId the ID of the domestic transfer to be deleted
//     * @return ResponseEntity containing the deletion status message or a not found error message
//     */
//    public ResponseEntity<String> deleteDomesticTransfer(UUID domesticTransferTrxId) {
//        boolean exist = customerRepository.existsById(domesticTransferTrxId);
//        if (!exist) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Domestic Transaction with id " + domesticTransferTrxId + " does not exist !");
//        } else {
//            customerRepository.deleteById(domesticTransferTrxId);
//            return ResponseEntity.ok("Domestic transfer deleted successfully.");
//        }
//    }
//}
