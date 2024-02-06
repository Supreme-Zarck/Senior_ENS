# SELinux Presentation Deliverable

## Overview

This README provides a brief overview, installation instructions, basic concepts, and commands to get started with SELinux. Customize it based on your audience and specific details related to your SELinux implementation.

## Contents

1. **Presentation PDF**: The main presentation slides in PDF format.

2. **Additional Resources Folder**: A folder containing any supplementary documents, references, or resources mentioned in the presentation.

3. **README File**: This document providing context and instructions for the deliverable.

## Presentation Details

- **Title:** Security Enhanced Linux
- **Author:** Soussan Jawad

## How to Use

1. **View Presentation**: Open the "Presentation PDF" to review the slides presented during the session.

2. **Explore Additional Resources**: Navigate to the "Additional Resources" for any supplementary materials or references.


Getting Started
Enable/Disable SELinux:

To enable SELinux in enforcing mode:
bash --> sudo setenforce 1
To disable SELinux in permissive mode:
bash --> sudo setenforce 0
View SELinux Contexts:

List SELinux contexts of files:
bash --> ls -Z /path/to/file

Change SELinux Context:

Change the context of a file:
bash --> sudo chcon -t target_context /path/to/file
Common Commands

sestatus: Display SELinux status and mode.
semanage: Manage SELinux policy.
audit2allow: Generate SELinux policy module from audit logs.

Troubleshooting

If you encounter issues:

Review SELinux logs:

bash --> sudo tail -f /var/log/audit/audit.log
Use audit2allow to generate policy suggestions based on audit logs.

#Additional Resources
  Official SELinux Documentation
  SELinux Wiki
Feel free to explore these resources for in-depth information and advanced configurations.

Happy SELinux-ing!


## Contact Information

For any questions or further clarification, feel free to contact the author:

- **Author:** Soussan Jawad
- **Email:** [jawadsoussan2001@gmail.com]

