import pytest

# Data Fixture 1
@pytest.fixture
def user_data():
    data = {'username': 'john_doe', 'email': 'john.doe@example.com', 'password': 'securepassword'}
    return data

# Data Fixture 2
@pytest.fixture
def product_data():
    data = {'product_name': 'Sample Product', 'price': 19.99, 'quantity': 100}
    return data

# Test Function 1 using user_data fixture
def test_user_registration(user_data):
    assert 'username' in user_data
    assert 'email' in user_data
    assert 'password' in user_data

# Test Function 2 using product_data fixture
def test_product_price(product_data):
    assert 'product_name' in product_data
    assert 'price' in product_data
    assert 'quantity' in product_data

# Test Function 3 using both user_data and product_data fixtures
def test_order_creation(user_data, product_data):
    assert 'username' in user_data
    assert 'email' in user_data
    assert 'password' in user_data

    assert 'product_name' in product_data
    assert 'price' in product_data
    assert 'quantity' in product_data

# You can add more fixtures and corresponding test functions as needed
