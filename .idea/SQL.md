# Introduction

This document provides the data structure and sample data for project.

# User
### User Table Creation

```
CREATE TABLE `user` (
  `id` int NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `username` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `type` enum('admin','user') COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
```
```
ALTER TABLE `user`
ADD PRIMARY KEY (`id`)

ALTER TABLE `user`
  MODIFY `id` int NOT NULL AUTO_INCREMENT,;
```

### Sample Data
```
INSERT INTO `user` (`id`, `name`, `username`, `password`, `type`) VALUES
(1, 'a', 'a', '1', 'admin'),
(2, 'as', 'fb', '123', 'user'),
```
# Customer
### Customer Table Creation

```
CREATE TABLE `customer` (
`id` int NOT NULL,
`hotel_id` int NOT NULL,
`room_id` int NOT NULL,
`name_surname` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
`email` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
`phone_number` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
`customer_ID` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
`adult_number` int NOT NULL,
`child_number` int NOT NULL,
`total_price` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
```
```
ALTER TABLE `customer`
ADD PRIMARY KEY (`id`)
  
ALTER TABLE `customer`
MODIFY `id` int NOT NULL AUTO_INCREMENT;
```

### Sample data

```
INSERT INTO `customer` (`id`, `hotel_id`, `room_id`, `name_surname`, `email`, `phone_number`, `customer_ID`, `adult_number`, `child_number`, `total_price`) VALUES
(8, 1, 38, 'abdullah aslan', 'abdullah@', '5051231212', '11111111111', 2, 1, 3700),
(9, 2, 41, 'fatih batur', 'fatih@', '5071231212', '22222222222', 1, 0, 1000),
(10, 17, 42, 'ibrahim boz', 'ibrahim@', '5061231212', '33333333333', 2, 0, 4000);

```
# Hotel
### Hotel Table Creation

```
CREATE TABLE `hotel` (
  `id` int NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `city` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `region` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `adress` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `phone_number` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `star` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

```
```
ALTER TABLE `hotel`
ADD PRIMARY KEY (`id`)

ALTER TABLE `hotel`
MODIFY `id` int NOT NULL AUTO_INCREMENT;
```
### Sample Data
```
INSERT INTO `hotel` (`id`, `name`, `city`, `region`, `adress`, `email`, `phone_number`, `star`) VALUES
(1, 'Kırıkkale Otel', 'Kırıkkale', 'Anatolia', 'Kırıkkale', 'kırıkkale@gmail.com', '5071234567', 3),
(2, 'The Green Park Pendik', 'İstanbul', 'Marmara', 'İstanbul', 'greenpark@gmail.com', '5123123213', 4),
(17, 'Sincan Otel', 'Ankara', 'İç Anadolu', 'Ankara Sincan', 'sncnhotel@', '5312313435', 5),
(18, 'Yıldız Hotel', 'İstanbul', 'İstanbul', 'İstanbul Beşiktaş', 'yıldız@', '51123123123', 5),
(21, 'cansev otel', 'yozgat', 'iç anadolu', 'yozgat merkez', 'cansev@', '555', 5);
```

# Facility Features
### Facility Features Creation
```
CREATE TABLE `facility_features` (
`id` int NOT NULL,
`hotel_id` int NOT NULL,
`features` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
```

```
ALTER TABLE `facility_features`
ADD PRIMARY KEY (`id`)
 
ALTER TABLE `facility_features`
MODIFY `id` int NOT NULL AUTO_INCREMENT;

```
### Sample Data
```
INSERT INTO `facility_features` (`id`, `hotel_id`, `features`) VALUES
(1, 1, 'Free Parking'),
(2, 1, 'Free Wifi'),
(7, 1, 'Concierge'),
(13, 17, 'Wifi'),
(14, 17, 'Park'),
(15, 17, 'Pool'),
(16, 17, 'SPA'),
(17, 18, 'Wifi'),
(18, 18, 'Fitness'),
(19, 21, 'Concierge'),
(20, 21, 'Park'),
(21, 21, 'SPA'),
(22, 1, 'Wifi'),
(23, 1, 'Fitness'),
(24, 1, 'Park'),
(25, 2, '7/24 Service'),
(26, 2, 'Pool'),
(27, 2, 'SPA'),
(28, 17, 'Concierge'),
(30, 18, 'Concierge'),
(31, 18, 'SPA'),
(32, 21, '7/24 Service'),
(34, 21, 'Park'),
(35, 21, 'SPA');
```
# Pension
### Pension Table Creation

```
CREATE TABLE `pension` (
  `id` int NOT NULL,
  `hotel_id` int NOT NULL,
  `pension` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

```
```
ALTER TABLE `pension`
ADD PRIMARY KEY (`id`)

ALTER TABLE `pension`
MODIFY `id` int NOT NULL AUTO_INCREMENT;
```
### Sample Data
```
INSERT INTO `pension` (`id`, `hotel_id`, `pension`) VALUES
(1, 1, 'Only Bed'),
(2, 1, 'Ultra Pension'),
(5, 14, 'Full Pension'),
(6, 14, 'Room Service'),
(7, 14, 'No Alcohol Full Credit'),
(8, 2, 'Full Pension'),
(9, 2, 'Room Service'),
(10, 17, 'Full Pension'),
(11, 17, 'Room Service'),
(12, 17, 'Ultra Pension'),
(13, 18, 'Only Bed'),
(14, 18, 'Ultra Pension'),
(15, 21, 'Full Pension'),
(16, 21, 'Room Service'),
(17, 21, 'Half Pension'),
(19, 1, 'Only Bed'),
(20, 1, 'Full Pension'),
(23, 2, 'Half Pension'),
(24, 2, 'No Alcohol Full Credit'),
(26, 17, 'No Alcohol Full Credit'),
(27, 18, 'Room Service'),
(28, 18, 'Half Pension'),
(29, 21, 'Only Bed'),
(31, 21, 'Ultra Pension'),
(32, 21, 'No Alcohol Full Credit');
```

# Room
### Room Table Creation
```
CREATE TABLE `room` (
`id` int NOT NULL,
`room` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
`hotel_id` int NOT NULL,
`season_id` int NOT NULL,
`pension_id` int NOT NULL,
`stock` int NOT NULL,
`adult_price` int NOT NULL,
`child_price` int NOT NULL,
`bed` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
```
```
ALTER TABLE `room`
ADD PRIMARY KEY (`id`)

ALTER TABLE `room`
MODIFY `id` int NOT NULL AUTO_INCREMENT;
```

### Sample Data
```
INSERT INTO `room` (`id`, `room`, `hotel_id`, `season_id`, `pension_id`, `stock`, `adult_price`, `child_price`, `bed`) VALUES
(37, 'Single', 2, 25, 6, 5, 600, 400, 4),
(38, 'King', 1, 24, 1, 1, 700, 450, 4),
(40, 'Single', 1, 25, 2, 4, 1000, 500, 4),
(41, 'Double', 2, 24, 17, 9, 500, 350, 3),
(42, 'Single', 17, 24, 5, 4, 1000, 750, 5),
(43, 'Double', 17, 25, 2, 4, 2500, 1500, 5),
(44, 'Single', 18, 24, 6, 4, 400, 300, 4),
(45, 'King', 18, 25, 2, 9, 3500, 2500, 5),
(46, 'Single', 21, 24, 1, 4, 300, 200, 4),
(47, 'Single', 21, 25, 5, 9, 200, 1500, 4),
(48, 'Single', 1, 37, 1, 9, 600, 400, 4),
(49, 'Single', 2, 38, 6, 4, 600, 350, 4),
(50, 'Single', 2, 38, 8, 9, 1500, 1200, 4);
```

# Room Features
### Room Features Table Creation

```
CREATE TABLE `room_features` (
`id` int NOT NULL,
`room_id` int NOT NULL,
`features` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

```
```
ALTER TABLE `room_features`
ADD PRIMARY KEY (`id`)

ALTER TABLE `room_features`
MODIFY `id` int NOT NULL AUTO_INCREMENT;
```

### Sample Data

```
INSERT INTO `room_features` (`id`, `room_id`, `features`) VALUES
(38, 37, 'Air Conditioner'),
(39, 37, 'Safe Case'),
(40, 37, 'Gaming Console'),
(41, 37, 'TV'),
(42, 38, 'TV'),
(43, 40, 'TV'),
(44, 40, 'Air Conditioner'),
(45, 40, 'Gaming Console'),
(46, 40, 'TV'),
(47, 41, 'Safe Case'),
(48, 42, 'Air Conditioner'),
(49, 42, 'Gaming Console'),
(50, 43, 'TV'),
(51, 44, 'Air Conditioner'),
(52, 44, 'Safe Case'),
(53, 44, 'Gaming Console'),
(54, 45, 'Gaming Console'),
(55, 45, 'TV'),
(56, 46, 'Air Conditioner'),
(57, 46, 'Safe Case'),
(58, 47, 'Safe Case'),
(59, 47, 'TV');
```

# Season
### Season Table Creation

```
CREATE TABLE `season` (
`id` int NOT NULL,
`hotel_id` int NOT NULL,
`season_start` date NOT NULL,
`season_end` date NOT NULL,
`season_type` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
```
```
ALTER TABLE `season`
ADD PRIMARY KEY (`id`)

ALTER TABLE `season`
MODIFY `id` int NOT NULL AUTO_INCREMENT;
```

### Sample Data

```
INSERT INTO `season` (`id`, `hotel_id`, `season_start`, `season_end`, `season_type`) VALUES
(24, 1, '2023-01-01', '2023-03-01', 'Winter Season'),
(25, 2, '2023-04-01', '2023-08-01', 'Summer Season'),
(29, 1, '2023-04-01', '2023-08-01', 'Summer Season'),
(30, 2, '2023-01-01', '2023-03-01', 'Winter Season'),
(31, 17, '2023-01-01', '2023-03-01', 'Winter Season'),
(32, 17, '2023-04-01', '2023-08-01', 'Summer Season'),
(33, 18, '2023-01-01', '2023-03-01', 'Winter Season'),
(34, 18, '2023-04-01', '2023-08-01', 'Summer Season'),
(35, 21, '2023-01-01', '2023-03-01', 'Winter Season'),
(36, 21, '2023-04-01', '2023-08-01', 'Summer Season'),
(37, 1, '2023-08-01', '2023-12-01', 'Autumn Season'),
(38, 2, '2023-08-01', '2023-12-01', 'Autumn Season');
```
