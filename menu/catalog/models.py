from django.db import models

# Create your models here.

class ProductType(models.Model):
    """
    This model represents a Product Type
    """

    # ProductType Primary Key
    # idProductType = models.IntegerField() # Let's see Django create PK

    # Product Description
    description = models.TextField(max_length="100")


class Product(models.Model):
    """
    This model represents a restaurant product 
    """

    # Product Primay Key
    # idProduct = models.IntegerField() # Let's see Django create PK

    # Product Type Foreign Key
    productType = models.ForeignKey(ProductType, on_delete=models.CASCADE)

    # Product Description
    description = models.TextField(max_length="100") 

    # Product Name
    name = models.TextField(max_length="20")

    # Product Price
    price = models.DecimalField(decimal_places=2, max_digits=3)
    

class Menu(models.Model):
    """
    This model represents a restaurant menu 
    """

    # product_id from extern service
    product_id = models.IntegerField()
