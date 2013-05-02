package auctionsniper;

public interface AuctionEventListener {

    public void auctionClosed();

    public void currentPrice(Integer currentPrice, Integer increment);
}
