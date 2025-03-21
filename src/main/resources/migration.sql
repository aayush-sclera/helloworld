-- Create the 'filters' table
CREATE TABLE filters (
                         id varchar(50),
                         name varchar(50)
);

-- Add a new column 'phone_number' to the 'demo' table (if it exists)
ALTER TABLE demo ADD COLUMN phone_number varchar(50);
