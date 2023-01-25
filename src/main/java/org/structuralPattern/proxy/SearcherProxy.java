package org.structuralPattern.proxy;

public class SearcherProxy extends Searcher{
    private RealSearcher realSearcher = new RealSearcher();
    AccessValidator validator = new AccessValidator();
    Logger logger = new Logger();

    private boolean validate(String userId){
        return validator.validate(userId);
    }

    private void log(String userId){
        logger.log(userId);
    }
    @Override
    public String doSearch(String userId, String keyword) {
        if(this.validate(userId)){
            String res = realSearcher.doSearch(userId,keyword);
            this.log(userId);
            return res;
        } else {
            return null;
        }
    }
}
