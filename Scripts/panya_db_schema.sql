--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: authorities; Type: TABLE; Schema: public; Owner: panya; Tablespace: 
--

CREATE TABLE authorities (
    id bigint NOT NULL,
    authority character varying(32) NOT NULL,
    username character varying(32) NOT NULL
);


ALTER TABLE authorities OWNER TO panya;

--
-- Name: buyer_profile; Type: TABLE; Schema: public; Owner: panya; Tablespace: 
--

CREATE TABLE buyer_profile (
    buyer_id bigint NOT NULL,
    buyer_primary_contact character varying(10) NOT NULL,
    buyer_secondary_contact character varying(10) NOT NULL,
    created_by character varying(32) NOT NULL,
    delivery_address character varying(256) NOT NULL,
    modified_by character varying(32),
    registered_shops character varying(1024) NOT NULL,
    created_date timestamp without time zone NOT NULL,
    modified_date timestamp without time zone
);


ALTER TABLE buyer_profile OWNER TO panya;

--
-- Name: cart; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE cart (
    cart_id bigint NOT NULL,
    item_id bigint NOT NULL,
    shop_id bigint NOT NULL,
    created_by character varying(32) NOT NULL,
    modified_by character varying(32),
    created_date timestamp without time zone NOT NULL,
    modified_date timestamp without time zone
);


ALTER TABLE cart OWNER TO postgres;

--
-- Name: discount; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE discount (
    discount_id bigint NOT NULL,
    discount integer NOT NULL,
    discount_expiry timestamp without time zone NOT NULL,
    discount_name character varying(32) NOT NULL,
    discount_start timestamp without time zone NOT NULL,
    discount_type integer NOT NULL,
    created_by character varying(32) NOT NULL,
    modified_by character varying(32),
    created_date timestamp without time zone NOT NULL,
    modified_date timestamp without time zone
);


ALTER TABLE discount OWNER TO postgres;

--
-- Name: item; Type: TABLE; Schema: public; Owner: panya; Tablespace: 
--

CREATE TABLE item (
    item_id bigint NOT NULL,
    shop_id bigint NOT NULL,
    created_by character varying(32) NOT NULL,
    discount_id bigint,
    item_brand character varying(32),
    item_desc character varying(64),
    item_name character varying(32) NOT NULL,
    item_price integer NOT NULL,
    item_unit character varying(16),
    modified_by character varying(32),
    created_date timestamp without time zone NOT NULL,
    modified_date timestamp without time zone
);


ALTER TABLE item OWNER TO panya;

--
-- Name: order_item; Type: TABLE; Schema: public; Owner: panya; Tablespace: 
--

CREATE TABLE order_item (
    item_id bigint NOT NULL,
    oder_id bigint NOT NULL,
    created_by character varying(32) NOT NULL,
    discounted_item_price bigint NOT NULL,
    modified_by character varying(32),
    created_date timestamp without time zone NOT NULL,
    modified_date timestamp without time zone
);


ALTER TABLE order_item OWNER TO panya;

--
-- Name: orders; Type: TABLE; Schema: public; Owner: panya; Tablespace: 
--

CREATE TABLE orders (
    order_id bigint NOT NULL,
    buyer_id bigint NOT NULL,
    created_by character varying(32) NOT NULL,
    modified_by character varying(32),
    oder_status character varying(32) NOT NULL,
    shop_id bigint NOT NULL,
    total_price bigint NOT NULL,
    created_date timestamp without time zone NOT NULL,
    modified_date timestamp without time zone
);


ALTER TABLE orders OWNER TO panya;

--
-- Name: shop_feedback; Type: TABLE; Schema: public; Owner: panya; Tablespace: 
--

CREATE TABLE shop_feedback (
    buyer_id bigint NOT NULL,
    shop_id bigint NOT NULL,
    created_by character varying(32) NOT NULL,
    modified_by character varying(32),
    shop_comments character varying(1024),
    shop_ratings integer NOT NULL,
    created_date timestamp without time zone NOT NULL,
    modified_date timestamp without time zone
);


ALTER TABLE shop_feedback OWNER TO panya;

--
-- Name: shopkeeper_profile; Type: TABLE; Schema: public; Owner: panya; Tablespace: 
--

CREATE TABLE shopkeeper_profile (
    shop_id bigint NOT NULL,
    created_by character varying(32) NOT NULL,
    modified_by character varying(32),
    shop_address character varying(256) NOT NULL,
    shop_city character varying(32) NOT NULL,
    shop_close_time timestamp without time zone,
    shop_coordinates_lat double precision,
    shop_coordinates_long double precision,
    shop_desc character varying(1024),
    shop_image character varying(32),
    shop_open_time timestamp without time zone,
    shop_pan character varying(32),
    shop_primary_contact character varying(10) NOT NULL,
    shop_product_tags character varying(1024),
    shop_secondary_contact character varying(10),
    shop_state character varying(32) NOT NULL,
    shop_tin character varying(32),
    created_date timestamp without time zone NOT NULL,
    modified_date timestamp without time zone
);


ALTER TABLE shopkeeper_profile OWNER TO panya;

--
-- Name: users; Type: TABLE; Schema: public; Owner: panya; Tablespace: 
--

CREATE TABLE users (
    user_id bigint NOT NULL,
    created_by character varying(32) NOT NULL,
    first_name character varying(64) NOT NULL,
    last_name character varying(64),
    mail_id character varying(64) NOT NULL,
    modified_by character varying(32),
    password character varying(64) NOT NULL,
    type integer NOT NULL,
    username character varying(32) NOT NULL,
    enabled boolean DEFAULT true NOT NULL,
    created_date timestamp without time zone NOT NULL,
    modified_date timestamp without time zone
);


ALTER TABLE users OWNER TO panya;

--
-- Name: buyer_profile_pkey; Type: CONSTRAINT; Schema: public; Owner: panya; Tablespace: 
--

ALTER TABLE ONLY buyer_profile
    ADD CONSTRAINT buyer_profile_pkey PRIMARY KEY (buyer_id);


--
-- Name: cart_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cart
    ADD CONSTRAINT cart_pkey PRIMARY KEY (cart_id, item_id, shop_id);


--
-- Name: discount_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY discount
    ADD CONSTRAINT discount_pkey PRIMARY KEY (discount_id);


--
-- Name: item_pkey; Type: CONSTRAINT; Schema: public; Owner: panya; Tablespace: 
--

ALTER TABLE ONLY item
    ADD CONSTRAINT item_pkey PRIMARY KEY (item_id, shop_id);


--
-- Name: order_item_pkey; Type: CONSTRAINT; Schema: public; Owner: panya; Tablespace: 
--

ALTER TABLE ONLY order_item
    ADD CONSTRAINT order_item_pkey PRIMARY KEY (item_id, oder_id);


--
-- Name: order_pkey; Type: CONSTRAINT; Schema: public; Owner: panya; Tablespace: 
--

ALTER TABLE ONLY orders
    ADD CONSTRAINT order_pkey PRIMARY KEY (order_id);


--
-- Name: shop_feedback_pkey; Type: CONSTRAINT; Schema: public; Owner: panya; Tablespace: 
--

ALTER TABLE ONLY shop_feedback
    ADD CONSTRAINT shop_feedback_pkey PRIMARY KEY (buyer_id, shop_id);


--
-- Name: shopkeeper_profile_pkey; Type: CONSTRAINT; Schema: public; Owner: panya; Tablespace: 
--

ALTER TABLE ONLY shopkeeper_profile
    ADD CONSTRAINT shopkeeper_profile_pkey PRIMARY KEY (shop_id);


--
-- Name: uk_8dxvvhpnxj565wsvijnu8lusp; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY discount
    ADD CONSTRAINT uk_8dxvvhpnxj565wsvijnu8lusp UNIQUE (discount_name);


--
-- Name: user_pkey; Type: CONSTRAINT; Schema: public; Owner: panya; Tablespace: 
--

ALTER TABLE ONLY users
    ADD CONSTRAINT user_pkey PRIMARY KEY (user_id);


--
-- Name: user_role_pk_key; Type: CONSTRAINT; Schema: public; Owner: panya; Tablespace: 
--

ALTER TABLE ONLY authorities
    ADD CONSTRAINT user_role_pk_key PRIMARY KEY (id);


--
-- Name: users_roles_unique_key; Type: CONSTRAINT; Schema: public; Owner: panya; Tablespace: 
--

ALTER TABLE ONLY authorities
    ADD CONSTRAINT users_roles_unique_key UNIQUE (username, authority);


--
-- Name: users_unique_key; Type: CONSTRAINT; Schema: public; Owner: panya; Tablespace: 
--

ALTER TABLE ONLY users
    ADD CONSTRAINT users_unique_key UNIQUE (username);


--
-- Name: buyer_order_fk_key; Type: FK CONSTRAINT; Schema: public; Owner: panya
--

ALTER TABLE ONLY orders
    ADD CONSTRAINT buyer_order_fk_key FOREIGN KEY (buyer_id) REFERENCES buyer_profile(buyer_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: buyer_this_fk_key; Type: FK CONSTRAINT; Schema: public; Owner: panya
--

ALTER TABLE ONLY shop_feedback
    ADD CONSTRAINT buyer_this_fk_key FOREIGN KEY (buyer_id) REFERENCES buyer_profile(buyer_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: discount_item_fk_key; Type: FK CONSTRAINT; Schema: public; Owner: panya
--

ALTER TABLE ONLY item
    ADD CONSTRAINT discount_item_fk_key FOREIGN KEY (discount_id) REFERENCES discount(discount_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: item_cart_fk_key; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cart
    ADD CONSTRAINT item_cart_fk_key FOREIGN KEY (item_id, shop_id) REFERENCES item(item_id, shop_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: order_this_fk_key; Type: FK CONSTRAINT; Schema: public; Owner: panya
--

ALTER TABLE ONLY order_item
    ADD CONSTRAINT order_this_fk_key FOREIGN KEY (oder_id) REFERENCES orders(order_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: shop_item_fk_key; Type: FK CONSTRAINT; Schema: public; Owner: panya
--

ALTER TABLE ONLY item
    ADD CONSTRAINT shop_item_fk_key FOREIGN KEY (shop_id) REFERENCES shopkeeper_profile(shop_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: shop_order_fk_key; Type: FK CONSTRAINT; Schema: public; Owner: panya
--

ALTER TABLE ONLY orders
    ADD CONSTRAINT shop_order_fk_key FOREIGN KEY (shop_id) REFERENCES shopkeeper_profile(shop_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: shop_this_fk_key; Type: FK CONSTRAINT; Schema: public; Owner: panya
--

ALTER TABLE ONLY shop_feedback
    ADD CONSTRAINT shop_this_fk_key FOREIGN KEY (shop_id) REFERENCES shopkeeper_profile(shop_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: user_buyer_fk_key; Type: FK CONSTRAINT; Schema: public; Owner: panya
--

ALTER TABLE ONLY buyer_profile
    ADD CONSTRAINT user_buyer_fk_key FOREIGN KEY (buyer_id) REFERENCES users(user_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: user_shopkeeper_fk_key; Type: FK CONSTRAINT; Schema: public; Owner: panya
--

ALTER TABLE ONLY shopkeeper_profile
    ADD CONSTRAINT user_shopkeeper_fk_key FOREIGN KEY (shop_id) REFERENCES users(user_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: users_roles_fk_key; Type: FK CONSTRAINT; Schema: public; Owner: panya
--

ALTER TABLE ONLY authorities
    ADD CONSTRAINT users_roles_fk_key FOREIGN KEY (username) REFERENCES users(username) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: public; Type: ACL; Schema: -; Owner: panya
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM panya;
GRANT ALL ON SCHEMA public TO panya;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

