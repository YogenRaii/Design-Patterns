package com.eprogrammerz.examples.gof.patterns.chainofresponsibility.ordermgmt;

/**
 * Concrete handler
 */
public class LargeOrderHandler extends OrderReceiver {
    @Override
    public void handleOrder(Order request) {
        if (request.getTotalAmount() > 30000) {
            System.out.println("Large order handle");
        } else if (successor != null) {
            successor.handleOrder(request);
        }
    }
}
