import csv

class ReadAndWriteData:

    def __init__(self, file_path):
        self.file_path = file_path
        self.data_list = []

    def read_data_from_csv(self):
        try:
            with open(self.file_path, 'r') as csv_file:
                csv_reader = csv.DictReader(csv_file)
                for row in csv_reader:
                    self.data_list.append(row)
        except FileNotFoundError:
            print(f"File not found: {self.file_path}")
        except Exception as e:
            print(f"Error reading CSV file: {e}")

    def display_data(self):
        for data in self.data_list:
            print(data)

# Example usage
if __name__ == "__main__":
    csv_file_path = "C:\\Users\\swayam\\OneDrive\\Documents\\testData.csv"  # Replace with the actual file path

    data_handler = ReadAndWriteData(csv_file_path)
    data_handler.read_data_from_csv()
    data_handler.display_data()
