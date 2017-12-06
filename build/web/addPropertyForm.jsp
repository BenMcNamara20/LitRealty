<%-- 
    Document   : AddPropertyForm
    Created on : 28-Nov-2017, 16:41:57
    Author     : benmc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="addPropertyServlet">
            <label>Street</label>
            <input type="text" name="Street" value="" />
            </br>
            <label>City</label>
            <input type="text" name="City" value="" />
            </br>
            <label>Listing Number</label>
            <input type="text" name="listingNum" value="" />
            </br>
            <label>Style</label>
            <select name="Style">
                <option>Bungalow</option>
                <option>Semi Detached</option>
                <option>Detached</option>
                <option>Cottage</option>
                <option>Terrace</option>
                <option>Duplex</option>
                <option>Condo</option>
                <option>Apartment</option>
                <option>Other</option>
            </select>
            </br>
            <label>Property Type</label>
            <select name="propertyType">
                <option>Residential-single</option>
                <option>Residential-multi</option>
                <option>Commercial</option>
            </select>
            </br>
            <label>Bedrooms</label>
            <input type="text" name="bedrooms" value="" />
            </br>
            <label>Bathrooms</label>
            <input type="text" name="bathrooms" value="" />
            </br>
            <label>Square Feet</label>
            <input type="text" name="sqaureFeet" value="" />
            </br>
            <select name="BERrating">
                <option>A1</option>
                <option>A2</option>
                <option>A3</option>
                <option>B1</option>
                <option>B2</option>
                <option>B3</option>
                <option>C1</option>
                <option>C2</option>
                <option>C3</option>
                <option>D1</option>
                <option>D2</option>
                <option>E1</option>
                <option>E2</option>
                <option>F</option>
                <option>G</option>
            </select>
            </br>
            <label>Description</label>
            <textarea name="Description" rows="4" cols="20">
            </textarea>
            </br>
            <label>Lot Size</label>
            <input type="text" name="lotsize" value="" />
            </br>
            <label>Garage Size</label>
            <input type="text" name="garageSize" value="" />
            </br>
            <label>Garage Type</label>
            <select name="garageType">
                <option>attached</option>
                <option>detached</option>
                <option>carport</option>
            </select>
            </br>
            <label>Price</label>
            <input type="text" name="Price" value="" />
            </br>
            <label>Date</label>
            <input type="date" name="Date" value="" />
            </br>
            <input type="submit" value="Submit " />
        </form>
    </body>
</html>
