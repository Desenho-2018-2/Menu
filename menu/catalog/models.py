from django.db import models

# Create your models here.

class Category(models.Model):
    """ 
    This model represents a product category
    """

    # Category name
    name = models.TextField(max_length="20")

class ProductType(models.Model):
    """
    This model represents a Product Type
    """

    # ProductType Primary Key
    # idProductType = models.IntegerField() # Let's see Django create PK

    # Product Description
    description = models.TextField(max_length="100")

    #Category from ProductType
    category = models.ForeignKey(Category, on_delete=models.CASCADE)


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
    
    
