package com.project.app.dao;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.app.entity.Product;

//Used in DAO class and translates JDBC checked exception to unchecked exception 
@Repository
public class ProductDAOImpl implements ProductDAO {

	// Autowiring sessionFactory bean
	@Autowired
	private SessionFactory sessionFactory;

	// @Transactional will Automatically be start and end the transactions
	@Transactional
	public List<Product> getProducts() {

		// Getting session object from sessionFactory
		Session currentSession = sessionFactory.getCurrentSession();

		/*
		 * // creating query Query theQuery = (Query)
		 * currentSession.createQuery("from products", Product.class);
		 * 
		 * // Getting list of products List<Product> products =
		 * ((org.hibernate.query.Query<Product>) theQuery).getResultList();
		 */

		// AccountAlert alert = new AccountAlert();

		List<Product> products = Collections.emptyList();
		try {
			Session session = sessionFactory.openSession();

			@SuppressWarnings("deprecation")
			Criteria productDetails = session.createCriteria(Product.class);

			products = productDetails.list();

			return products;
		} catch (Exception e) {
			System.out.println("exception");
		}
		return products;

	}
}