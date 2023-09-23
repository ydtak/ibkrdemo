package ydtak.ibkrdemo;

import com.ib.client.Bar;
import com.ib.client.CommissionReport;
import com.ib.client.Contract;
import com.ib.client.ContractDescription;
import com.ib.client.ContractDetails;
import com.ib.client.Decimal;
import com.ib.client.DeltaNeutralContract;
import com.ib.client.DepthMktDataDescription;
import com.ib.client.EWrapper;
import com.ib.client.Execution;
import com.ib.client.FamilyCode;
import com.ib.client.HistogramEntry;
import com.ib.client.HistoricalSession;
import com.ib.client.HistoricalTick;
import com.ib.client.HistoricalTickBidAsk;
import com.ib.client.HistoricalTickLast;
import com.ib.client.NewsProvider;
import com.ib.client.Order;
import com.ib.client.OrderState;
import com.ib.client.PriceIncrement;
import com.ib.client.SoftDollarTier;
import com.ib.client.TickAttrib;
import com.ib.client.TickAttribBidAsk;
import com.ib.client.TickAttribLast;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Demo implementation of {@link EWrapper}. Implements minimal methods required for a simple
 * connection to IB Gateway.
 */
class DemoWrapper implements EWrapper {

  @Override
  public void tickPrice(int tickerId, int field, double price, TickAttrib attrib) {
    throw new UnsupportedOperationException("Unimplemented method 'tickPrice'");
  }

  @Override
  public void tickSize(int tickerId, int field, Decimal size) {
    throw new UnsupportedOperationException("Unimplemented method 'tickSize'");
  }

  @Override
  public void tickOptionComputation(
      int tickerId,
      int field,
      int tickAttrib,
      double impliedVol,
      double delta,
      double optPrice,
      double pvDividend,
      double gamma,
      double vega,
      double theta,
      double undPrice) {
    throw new UnsupportedOperationException("Unimplemented method 'tickOptionComputation'");
  }

  @Override
  public void tickGeneric(int tickerId, int tickType, double value) {
    throw new UnsupportedOperationException("Unimplemented method 'tickGeneric'");
  }

  @Override
  public void tickString(int tickerId, int tickType, String value) {
    throw new UnsupportedOperationException("Unimplemented method 'tickString'");
  }

  @Override
  public void tickEFP(
      int tickerId,
      int tickType,
      double basisPoints,
      String formattedBasisPoints,
      double impliedFuture,
      int holdDays,
      String futureLastTradeDate,
      double dividendImpact,
      double dividendsToLastTradeDate) {
    throw new UnsupportedOperationException("Unimplemented method 'tickEFP'");
  }

  @Override
  public void orderStatus(
      int orderId,
      String status,
      Decimal filled,
      Decimal remaining,
      double avgFillPrice,
      int permId,
      int parentId,
      double lastFillPrice,
      int clientId,
      String whyHeld,
      double mktCapPrice) {
    throw new UnsupportedOperationException("Unimplemented method 'orderStatus'");
  }

  @Override
  public void openOrder(int orderId, Contract contract, Order order, OrderState orderState) {
    throw new UnsupportedOperationException("Unimplemented method 'openOrder'");
  }

  @Override
  public void openOrderEnd() {
    throw new UnsupportedOperationException("Unimplemented method 'openOrderEnd'");
  }

  @Override
  public void updateAccountValue(String key, String value, String currency, String accountName) {
    throw new UnsupportedOperationException("Unimplemented method 'updateAccountValue'");
  }

  @Override
  public void updatePortfolio(
      Contract contract,
      Decimal position,
      double marketPrice,
      double marketValue,
      double averageCost,
      double unrealizedPNL,
      double realizedPNL,
      String accountName) {
    throw new UnsupportedOperationException("Unimplemented method 'updatePortfolio'");
  }

  @Override
  public void updateAccountTime(String timeStamp) {
    throw new UnsupportedOperationException("Unimplemented method 'updateAccountTime'");
  }

  @Override
  public void accountDownloadEnd(String accountName) {
    throw new UnsupportedOperationException("Unimplemented method 'accountDownloadEnd'");
  }

  @Override
  public void nextValidId(int orderId) {
    throw new UnsupportedOperationException("Unimplemented method 'nextValidId'");
  }

  @Override
  public void contractDetails(int reqId, ContractDetails contractDetails) {
    throw new UnsupportedOperationException("Unimplemented method 'contractDetails'");
  }

  @Override
  public void bondContractDetails(int reqId, ContractDetails contractDetails) {
    throw new UnsupportedOperationException("Unimplemented method 'bondContractDetails'");
  }

  @Override
  public void contractDetailsEnd(int reqId) {
    throw new UnsupportedOperationException("Unimplemented method 'contractDetailsEnd'");
  }

  @Override
  public void execDetails(int reqId, Contract contract, Execution execution) {
    throw new UnsupportedOperationException("Unimplemented method 'execDetails'");
  }

  @Override
  public void execDetailsEnd(int reqId) {
    throw new UnsupportedOperationException("Unimplemented method 'execDetailsEnd'");
  }

  @Override
  public void updateMktDepth(
      int tickerId, int position, int operation, int side, double price, Decimal size) {
    throw new UnsupportedOperationException("Unimplemented method 'updateMktDepth'");
  }

  @Override
  public void updateMktDepthL2(
      int tickerId,
      int position,
      String marketMaker,
      int operation,
      int side,
      double price,
      Decimal size,
      boolean isSmartDepth) {
    throw new UnsupportedOperationException("Unimplemented method 'updateMktDepthL2'");
  }

  @Override
  public void updateNewsBulletin(int msgId, int msgType, String message, String origExchange) {
    throw new UnsupportedOperationException("Unimplemented method 'updateNewsBulletin'");
  }

  @Override
  public void managedAccounts(String accountsList) {
    throw new UnsupportedOperationException("Unimplemented method 'managedAccounts'");
  }

  @Override
  public void receiveFA(int faDataType, String xml) {
    throw new UnsupportedOperationException("Unimplemented method 'receiveFA'");
  }

  @Override
  public void historicalData(int reqId, Bar bar) {
    throw new UnsupportedOperationException("Unimplemented method 'historicalData'");
  }

  @Override
  public void scannerParameters(String xml) {
    throw new UnsupportedOperationException("Unimplemented method 'scannerParameters'");
  }

  @Override
  public void scannerData(
      int reqId,
      int rank,
      ContractDetails contractDetails,
      String distance,
      String benchmark,
      String projection,
      String legsStr) {
    throw new UnsupportedOperationException("Unimplemented method 'scannerData'");
  }

  @Override
  public void scannerDataEnd(int reqId) {
    throw new UnsupportedOperationException("Unimplemented method 'scannerDataEnd'");
  }

  @Override
  public void realtimeBar(
      int reqId,
      long time,
      double open,
      double high,
      double low,
      double close,
      Decimal volume,
      Decimal wap,
      int count) {
    throw new UnsupportedOperationException("Unimplemented method 'realtimeBar'");
  }

  @Override
  public void currentTime(long time) {
    throw new UnsupportedOperationException("Unimplemented method 'currentTime'");
  }

  @Override
  public void fundamentalData(int reqId, String data) {
    throw new UnsupportedOperationException("Unimplemented method 'fundamentalData'");
  }

  @Override
  public void deltaNeutralValidation(int reqId, DeltaNeutralContract deltaNeutralContract) {
    throw new UnsupportedOperationException("Unimplemented method 'deltaNeutralValidation'");
  }

  @Override
  public void tickSnapshotEnd(int reqId) {
    throw new UnsupportedOperationException("Unimplemented method 'tickSnapshotEnd'");
  }

  @Override
  public void marketDataType(int reqId, int marketDataType) {
    throw new UnsupportedOperationException("Unimplemented method 'marketDataType'");
  }

  @Override
  public void commissionReport(CommissionReport commissionReport) {
    throw new UnsupportedOperationException("Unimplemented method 'commissionReport'");
  }

  @Override
  public void position(String account, Contract contract, Decimal pos, double avgCost) {
    throw new UnsupportedOperationException("Unimplemented method 'position'");
  }

  @Override
  public void positionEnd() {
    throw new UnsupportedOperationException("Unimplemented method 'positionEnd'");
  }

  @Override
  public void accountSummary(int reqId, String account, String tag, String value, String currency) {
    throw new UnsupportedOperationException("Unimplemented method 'accountSummary'");
  }

  @Override
  public void accountSummaryEnd(int reqId) {
    throw new UnsupportedOperationException("Unimplemented method 'accountSummaryEnd'");
  }

  @Override
  public void verifyMessageAPI(String apiData) {
    throw new UnsupportedOperationException("Unimplemented method 'verifyMessageAPI'");
  }

  @Override
  public void verifyCompleted(boolean isSuccessful, String errorText) {
    throw new UnsupportedOperationException("Unimplemented method 'verifyCompleted'");
  }

  @Override
  public void verifyAndAuthMessageAPI(String apiData, String xyzChallenge) {
    throw new UnsupportedOperationException("Unimplemented method 'verifyAndAuthMessageAPI'");
  }

  @Override
  public void verifyAndAuthCompleted(boolean isSuccessful, String errorText) {
    throw new UnsupportedOperationException("Unimplemented method 'verifyAndAuthCompleted'");
  }

  @Override
  public void displayGroupList(int reqId, String groups) {
    throw new UnsupportedOperationException("Unimplemented method 'displayGroupList'");
  }

  @Override
  public void displayGroupUpdated(int reqId, String contractInfo) {
    throw new UnsupportedOperationException("Unimplemented method 'displayGroupUpdated'");
  }

  @Override
  public void error(Exception e) {
    System.out.println("Error: " + e);
  }

  @Override
  public void error(String str) {
    System.out.println("Error: " + str);
  }

  @Override
  public void error(int id, int errorCode, String errorMsg, String advancedOrderRejectJson) {
    System.out.println(
        String.format(
            "Error: id:%s errorCode:%s errorMsg:%s advanceOrderRejectionJson:%s",
            id, errorCode, errorMsg, advancedOrderRejectJson));
  }

  @Override
  public void connectionClosed() {
    System.out.println("Connection closed.");
  }

  @Override
  public void connectAck() {
    System.out.println("Connect ack.");
  }

  @Override
  public void positionMulti(
      int reqId, String account, String modelCode, Contract contract, Decimal pos, double avgCost) {
    throw new UnsupportedOperationException("Unimplemented method 'positionMulti'");
  }

  @Override
  public void positionMultiEnd(int reqId) {
    throw new UnsupportedOperationException("Unimplemented method 'positionMultiEnd'");
  }

  @Override
  public void accountUpdateMulti(
      int reqId, String account, String modelCode, String key, String value, String currency) {
    throw new UnsupportedOperationException("Unimplemented method 'accountUpdateMulti'");
  }

  @Override
  public void accountUpdateMultiEnd(int reqId) {
    throw new UnsupportedOperationException("Unimplemented method 'accountUpdateMultiEnd'");
  }

  @Override
  public void securityDefinitionOptionalParameter(
      int reqId,
      String exchange,
      int underlyingConId,
      String tradingClass,
      String multiplier,
      Set<String> expirations,
      Set<Double> strikes) {
    throw new UnsupportedOperationException(
        "Unimplemented method 'securityDefinitionOptionalParameter'");
  }

  @Override
  public void securityDefinitionOptionalParameterEnd(int reqId) {
    throw new UnsupportedOperationException(
        "Unimplemented method 'securityDefinitionOptionalParameterEnd'");
  }

  @Override
  public void softDollarTiers(int reqId, SoftDollarTier[] tiers) {
    throw new UnsupportedOperationException("Unimplemented method 'softDollarTiers'");
  }

  @Override
  public void familyCodes(FamilyCode[] familyCodes) {
    throw new UnsupportedOperationException("Unimplemented method 'familyCodes'");
  }

  @Override
  public void symbolSamples(int reqId, ContractDescription[] contractDescriptions) {
    throw new UnsupportedOperationException("Unimplemented method 'symbolSamples'");
  }

  @Override
  public void historicalDataEnd(int reqId, String startDateStr, String endDateStr) {
    throw new UnsupportedOperationException("Unimplemented method 'historicalDataEnd'");
  }

  @Override
  public void mktDepthExchanges(DepthMktDataDescription[] depthMktDataDescriptions) {
    throw new UnsupportedOperationException("Unimplemented method 'mktDepthExchanges'");
  }

  @Override
  public void tickNews(
      int tickerId,
      long timeStamp,
      String providerCode,
      String articleId,
      String headline,
      String extraData) {
    throw new UnsupportedOperationException("Unimplemented method 'tickNews'");
  }

  @Override
  public void smartComponents(int reqId, Map<Integer, Entry<String, Character>> theMap) {
    throw new UnsupportedOperationException("Unimplemented method 'smartComponents'");
  }

  @Override
  public void tickReqParams(
      int tickerId, double minTick, String bboExchange, int snapshotPermissions) {
    throw new UnsupportedOperationException("Unimplemented method 'tickReqParams'");
  }

  @Override
  public void newsProviders(NewsProvider[] newsProviders) {
    throw new UnsupportedOperationException("Unimplemented method 'newsProviders'");
  }

  @Override
  public void newsArticle(int requestId, int articleType, String articleText) {
    throw new UnsupportedOperationException("Unimplemented method 'newsArticle'");
  }

  @Override
  public void historicalNews(
      int requestId, String time, String providerCode, String articleId, String headline) {
    throw new UnsupportedOperationException("Unimplemented method 'historicalNews'");
  }

  @Override
  public void historicalNewsEnd(int requestId, boolean hasMore) {
    throw new UnsupportedOperationException("Unimplemented method 'historicalNewsEnd'");
  }

  @Override
  public void headTimestamp(int reqId, String headTimestamp) {
    throw new UnsupportedOperationException("Unimplemented method 'headTimestamp'");
  }

  @Override
  public void histogramData(int reqId, List<HistogramEntry> items) {
    throw new UnsupportedOperationException("Unimplemented method 'histogramData'");
  }

  @Override
  public void historicalDataUpdate(int reqId, Bar bar) {
    throw new UnsupportedOperationException("Unimplemented method 'historicalDataUpdate'");
  }

  @Override
  public void rerouteMktDataReq(int reqId, int conId, String exchange) {
    throw new UnsupportedOperationException("Unimplemented method 'rerouteMktDataReq'");
  }

  @Override
  public void rerouteMktDepthReq(int reqId, int conId, String exchange) {
    throw new UnsupportedOperationException("Unimplemented method 'rerouteMktDepthReq'");
  }

  @Override
  public void marketRule(int marketRuleId, PriceIncrement[] priceIncrements) {
    throw new UnsupportedOperationException("Unimplemented method 'marketRule'");
  }

  @Override
  public void pnl(int reqId, double dailyPnL, double unrealizedPnL, double realizedPnL) {
    throw new UnsupportedOperationException("Unimplemented method 'pnl'");
  }

  @Override
  public void pnlSingle(
      int reqId,
      Decimal pos,
      double dailyPnL,
      double unrealizedPnL,
      double realizedPnL,
      double value) {
    throw new UnsupportedOperationException("Unimplemented method 'pnlSingle'");
  }

  @Override
  public void historicalTicks(int reqId, List<HistoricalTick> ticks, boolean done) {
    throw new UnsupportedOperationException("Unimplemented method 'historicalTicks'");
  }

  @Override
  public void historicalTicksBidAsk(int reqId, List<HistoricalTickBidAsk> ticks, boolean done) {
    throw new UnsupportedOperationException("Unimplemented method 'historicalTicksBidAsk'");
  }

  @Override
  public void historicalTicksLast(int reqId, List<HistoricalTickLast> ticks, boolean done) {
    throw new UnsupportedOperationException("Unimplemented method 'historicalTicksLast'");
  }

  @Override
  public void tickByTickAllLast(
      int reqId,
      int tickType,
      long time,
      double price,
      Decimal size,
      TickAttribLast tickAttribLast,
      String exchange,
      String specialConditions) {
    throw new UnsupportedOperationException("Unimplemented method 'tickByTickAllLast'");
  }

  @Override
  public void tickByTickBidAsk(
      int reqId,
      long time,
      double bidPrice,
      double askPrice,
      Decimal bidSize,
      Decimal askSize,
      TickAttribBidAsk tickAttribBidAsk) {
    throw new UnsupportedOperationException("Unimplemented method 'tickByTickBidAsk'");
  }

  @Override
  public void tickByTickMidPoint(int reqId, long time, double midPoint) {
    throw new UnsupportedOperationException("Unimplemented method 'tickByTickMidPoint'");
  }

  @Override
  public void orderBound(long orderId, int apiClientId, int apiOrderId) {
    throw new UnsupportedOperationException("Unimplemented method 'orderBound'");
  }

  @Override
  public void completedOrder(Contract contract, Order order, OrderState orderState) {
    throw new UnsupportedOperationException("Unimplemented method 'completedOrder'");
  }

  @Override
  public void completedOrdersEnd() {
    throw new UnsupportedOperationException("Unimplemented method 'completedOrdersEnd'");
  }

  @Override
  public void replaceFAEnd(int reqId, String text) {
    throw new UnsupportedOperationException("Unimplemented method 'replaceFAEnd'");
  }

  @Override
  public void wshMetaData(int reqId, String dataJson) {
    throw new UnsupportedOperationException("Unimplemented method 'wshMetaData'");
  }

  @Override
  public void wshEventData(int reqId, String dataJson) {
    throw new UnsupportedOperationException("Unimplemented method 'wshEventData'");
  }

  @Override
  public void historicalSchedule(
      int reqId,
      String startDateTime,
      String endDateTime,
      String timeZone,
      List<HistoricalSession> sessions) {
    throw new UnsupportedOperationException("Unimplemented method 'historicalSchedule'");
  }

  @Override
  public void userInfo(int reqId, String whiteBrandingId) {
    throw new UnsupportedOperationException("Unimplemented method 'userInfo'");
  }
}
