package cit59x.hackathon.mental_placeblog.service;

import cit59x.hackathon.mental_placeblog.repo.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskSevice {

//    private static EntityManagerFactory factory;
//    private static EntityManager manager;
//    private static EntityTransaction transaction;
//    private static Session session;

    private final QuoteRepository quoteRepository;

    @Autowired
    public TaskSevice(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    /**
     * Get a proper quote from database and return.
     *
     * @return quote content
     */
    public String getQuote() {
//        factory = Persistence.createEntityManagerFactory("default");
//        manager = factory.createEntityManager();
//        session = manager.unwrap(Session.class);
//        transaction = manager.getTransaction();
        //get a random quote from db
        int totalCount = (int) quoteRepository.count();
        int id = (int) ((Math.random() * (totalCount - 1)) + 1);
        String res = quoteRepository.findById(id).get().getContent();
//        session.close();
//        manager.close();
//        factory.close();
        return res;
    }

//    /**
//     * Get quote by ID from database and return.
//     *
//     * @return quote content
//     */
//    public String getQuoteByID(int id) {
//        TypedQuery<Quote> getQuoteByIdQuery = manager.createNamedQuery("Quote.byID", Quote.class);
//        getQuoteByIdQuery.setParameter(1, id);
//        List<Quote> results = getQuoteByIdQuery.getResultList();
//        return results.get(0).getContent();
//    }
}
