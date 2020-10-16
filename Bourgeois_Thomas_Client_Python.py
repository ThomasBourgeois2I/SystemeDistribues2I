# -*- coding: utf-8 -*-
"""
Created on Thu Oct 15 08:29:40 2020

@author: thoma
"""

import requests
code="1"
produit = '{"code":4,"designation":"Pêche","prix":10}'
test_url = "http://localhost:8080/test"
getall_url = "http://localhost:8080/getall/"
getone_url = "http://localhost:8080/getone/"
save = "http://localhost:8080/save/"


print("1 - Get all products")
print("2 - Get one product")
print("3 - Save a product")
choice = str(input("Make your choice: "))

if choice == "1":
	online_url = getall_url
	resp = requests.get(online_url)
	print(resp.json())
	
if choice == "2":
	code=input("Select a product code: ")
	online_url = getone_url+str(code)
	resp = requests.get(online_url)
	print(resp.json())
	
if choice == "3":
	code=input("Select a product code: ")
	designation=input("Select a product designation: ")
	prix=input("Select the price: ")
	online_url = getone_url+"{"+str(code)+"," + str(designation) + "," + str(prix)+"}"
	resp = requests.get(online_url)
	print(resp.json())
	
if resp.status_code != 200:
	# This means something went wrong.
	print("API Error")
	print(resp.json())

