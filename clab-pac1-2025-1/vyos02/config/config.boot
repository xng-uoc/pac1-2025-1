interfaces {
    dummy dum0 {
        address "2.2.2.2/32"
    }
    ethernet eth0 {
        address "172.20.20.42/24"
        address "3fff:172:20:20::3/64"
        description "Management Interface"
    }
    ethernet eth1 {
        address "10.1.2.2/30"
    }
    ethernet eth2 {
        address "10.2.3.1/30"
    }
    ethernet eth3 {
        address "192.168.2.1/24"
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDizCCAnOgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzEtMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjUyMDA4MThaFw0yNjA5MjUyMDA4MThaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJwYWMxLTIwMjUtMSBsYWIgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCrv6i5reawKIqp5r8rUNjLhYatvJCfwd+yOLW01efHF/oyRizfL6Udcxjcz+r5o10oZJp5hlpIbGzSmqIfWrfO7aszMH2gq+Rm42CqxqSFkUs56/AtjvjtW7S2OVT+0kLQwLmXRgNnt3uaaiP6BuvFnjgu3HOtjrq6gHuyEipBs/AahrorUZxqXdLxwql35IZFl59UKU2RFs0rX24FUdi2AXmO/k9pH/DBonWKG1rDj+aNZJ7rbjSN+PxHGCi4sOLOF3RkE6pRUOUVij5BW8ndLFt1jpswyVh4pF2WNG1kDRsCBL0UDEemjibd06GHhyTfrtML6EY/ia87EnVZt3qBAgMBAAGjYTBfMA4GA1UdDwEB/wQEAwIChDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUJ3mIpml0XzfYcX0ecIFeZh1FBjMwDQYJKoZIhvcNAQELBQADggEBAE0lDl6v1xbG+SAW2ArI6r4STeiqga9ZyLXZ1Cu65i5BLyspKN+Gx9kw+4Ry3y+JNaEzovHhIOzAfuc43FgRoLxX0AmhJed81tulYKNbDgo30Xit8gGMDN95xhr3cTt4/kKPP2wIHCXd4xm+mEmpy+GwaKxaUMeFbidzbgVsMijrEcB0ACflLk72mmfxPzRbxVTVnAwrSzoL8cf7tljsk64ihC6BJHHHXy9cgxGCf8RAMoNW3GuEh8y03vbKkbEP1uucWUSzeAbF9iMrzvCv5bcn9rCQtILvIUrMNTcmaP84/Y83LuWuZWb7GgiX7tGU4LYweuYhZCRupyOnwQtaDKk="
    }
    certificate self {
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzEtMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjUyMDA4MThaFw0yNjA5MjUyMDA4MThaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMDIucGFjMS0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQC9jDoN98PiF18xOW/RPxYupN6Wngd9dTlQBzZItWOTTm2imTiRijwb2jjDBgTm455tFYmqHaoSumdaY5ujwX7eBVxyd1cQINjFXHrHESHKY2lH9oq9k7E7K9D5MC0j+3gMYuNvT+aSm+qHLiUoTDi/9wRXfnegfR0hvXrNMnGpRGDPZjaYi4t4zC18Qc2W32vy8G8S9Dm6g+c1I6xvwTzy9YnZVXuCFN1OcMzb1jHcu/Y5vibzfe7zaO00x843bHMsVGZ7alMjVBVn0O76zfP+k4rVssetXIwGcUg1JPBvwkESmvhUJP3X2G6p6JITKullDWi4u7Portw0tkQ/EoZfAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUJ3mIpml0XzfYcX0ecIFeZh1FBjMwRwYDVR0RBEAwPoIGdnlvczAyghdjbGFiLXBhYzEtMjAyNS0xLXZ5b3MwMoIVdnlvczAyLnBhYzEtMjAyNS0xLmlvhwSsFBQqMA0GCSqGSIb3DQEBCwUAA4IBAQBIEbBELeZd5MWW2LSx2tZuFJSiGU0D1zGXiC4/1wZiEuuX1xV9JFuZ8VOzG4FNFxgS7eDox2UhZaNzYy00Fdm9Lj6IhD3n6K5WgBGmgNdrxbqSqJTGFRORMg1uiLvpvNtj0zXSIWp4kobNKWd5AsUjNI8gLMdqixeK0FsDm7uCpzaYUZAJ/QPzpKcnc1pt4nLJvKCGAYP6ASO9Kf3bK+JZBIp2LA2RbqL9QnzXZGh1/ZVI6RKD3nstB2OjEwIHwOEqZurDye4H6ClobiomKRr1Ml+dqI7M9ghdWk05caHvg+wRUQLDijqJrRsnTA62tbD/6kYwY0tsSB+SgNZtbP39"
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC9jDoN98PiF18xOW/RPxYupN6Wngd9dTlQBzZItWOTTm2imTiRijwb2jjDBgTm455tFYmqHaoSumdaY5ujwX7eBVxyd1cQINjFXHrHESHKY2lH9oq9k7E7K9D5MC0j+3gMYuNvT+aSm+qHLiUoTDi/9wRXfnegfR0hvXrNMnGpRGDPZjaYi4t4zC18Qc2W32vy8G8S9Dm6g+c1I6xvwTzy9YnZVXuCFN1OcMzb1jHcu/Y5vibzfe7zaO00x843bHMsVGZ7alMjVBVn0O76zfP+k4rVssetXIwGcUg1JPBvwkESmvhUJP3X2G6p6JITKullDWi4u7Portw0tkQ/EoZfAgMBAAECggEAAfaphnmEQEmp2M6DibzIJ46Rg4Sh+g0QVTVBnDbzyvzhfJVUrE0V57REAeeK9JXCe69dqaK7PNTWrh6kV7iRzYq6Q+YCr+1KDXjtjCiSYI0+G139zptz9jh4NWH1LFELdlET7gPad3vr/yLACI72S4kKl0SD4rqEJJyKAY894bg+U8fiP+L0SSZFq55fkS70cbaN1GjmvFjAmCuJepoAUlGjeNMwS0SqpJUJy9bgie9z7HSFxtzTVTo/ASU8N718I+q1S0AvduirSHrRS+C4lWkjvHsw/4JyWrEaxuwMiYX9YchDg3PWJtzRL3hJWFlZw1TcLvq+q7K+s49MbsGBEQKBgQD34+o+zIOXSQ3x5g2DlWVzx0/jiBvgAT5Y8AdEORZt1nIREdsykxQIXMlGwVovqFz9RxvuroQNNLqU2Mve8NeiYr+TdVe/CrfesKVnJaczdBPj0+H76Z/JuA6a9eQG/VZ2jHErzD9YNukzQ5KfkzQEuPcVVh+QBUsxBP64zE41JwKBgQDDv7ExWFhBdXeI8vWpf0/gbGYddS6gyF1ENRuhbe1II+zabGF87KFCsnG1tdR684GhUNUlDrDd7M4bSetjyyzGvqoX7d/lVhUMnpyw9mBZWEvg8zHYKB16jOUiewOfV6cOw+MOm510WCjjXR4S0xrZC2Ymd3GzVNc0b4pgBlEYCQKBgEcIzKtKN7s2eASFhAHc4cGXr9Dnw/Ug5hjeT3bBVSgMd4tkroeDlg3/aL4Z0houCNebdOmkoLqYDY9xwJoWMfSaj4NV8NsR2za5L+yq4YrhDIIQyYVCoUNQtv64z6shFZHLFPMUCGLi+VhzWKTZreJcjpFSqKDAo5dccxHJme+pAoGAUVmE5iD07J9Iwh1Wgs5p/7aM6Ykdi6w5NnNrvDbW+bgUYuHP0f71Naa7Iu0iFMbGBKh3LCNi1ZfoP+cEcECrpxzty2wMNF8F+Gyiadi6SecsAZyQBmkFdzy+rQm6g6oFv1khL5z0XrmUpIi6StB4w+K83ReepQyJMz13oFh/syECgYEAoA6Xw9bp1PWwHnw+nQ0htsdW9oUuG7fea+ap/g/IdosmQJYnMteo2wiGPMvH1KUYBZBFrfbG0Z2d+knIG8KvQrgnHBIoeSUl5ZmAn11rgWz8Xn5Z0C5TTWaFxfBaCxNzv20eW8mUxBP7OA4IwL5/oTtiUnfnsJLYr45maKtrkjU="
        }
    }
}
protocols {
    ospf {
        area 0 {
            network "10.1.2.0/30"
            network "10.2.3.0/30"
            network "192.168.2.0/24"
            network "2.2.2.2/32"
        }
        interface dum0 {
            passive {
            }
        }
        interface eth1 {
            network "point-to-point"
        }
        interface eth2 {
            network "point-to-point"
        }
        interface eth3 {
            passive {
            }
        }
    }
}
service {
    https {
        api {
            keys {
                id admin {
                    key "admin"
                }
            }
            rest {
            }
        }
        certificates {
            ca-certificate "clab"
            certificate "self"
        }
        listen-address "0.0.0.0"
    }
    ntp {
        allow-client {
            address "127.0.0.0/8"
            address "169.254.0.0/16"
            address "10.0.0.0/8"
            address "172.16.0.0/12"
            address "192.168.0.0/16"
            address "::1/128"
            address "fe80::/10"
            address "fc00::/7"
        }
        server time1.vyos.net {
        }
        server time2.vyos.net {
        }
        server time3.vyos.net {
        }
    }
    ssh {
        listen-address "0.0.0.0"
    }
}
system {
    config-management {
        commit-revisions "100"
    }
    host-name "vyos02"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$z.Mt6nJyoINzDOIj$DgBSB9JdRJbqQ/x7dfZuQgNk65r3VdZdMbhxEVvxk6XpAVpBDrTYf47qGVrvsZMHNPZh9z5mBN8c8P.nlybmd0"
                public-keys clab {
                    key "AAAAB3NzaC1yc2EAAAADAQABAAABgQCqnzaeMn5uFxEAkG917XwNy+xwwZlsUy86pLZzgXMyO7X3EVIyEv6/LbgR9mXYZOtzDJHPecVi5H+lSy2jFGwXaacGAhcjg3XQQevKoaBW2g45WI38Bjnxm8hACRo/5aoY80ResYIOdtvAoLiUOGe9x74lUsUVT7iv9DSuyMlVI6CeZkqzcMaAu7fKSfIvl40YmgW1lC3OKANGIT5LLL6310PfuBZsQHh2Ye/F2q3bOgL8NSJ/dp7Ml6mvLLwyCwqHlxATWB7V2vUHOokEKo15HOqC/maugeht486b1gEKrMpL1oZsBrEBAs5MkHfYGNqfmY07crI83F2VnF6N4/ez8eP8EJoBj/99rZMX6Ish04Bw8MmTfppBZKrhaVFGNq9e6YSgjd6mFNmZkX/GO89CSd9TCFMdqYJYyc+3YmnHRL4AWgO/er9Ja/K2X6R6Dw2lo4PXRWfyspN7HAhZkZV2c1Uaxx3MyOC1fmvzou7b3uBEEpb40lOijEGVL7q2780="
                    type "ssh-rsa"
                }
            }
        }
    }
    syslog {
        local {
            facility all {
                level "info"
            }
            facility local7 {
                level "debug"
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@19:flow-accounting@1:https@7:ids@1:interfaces@33:ipoe-server@4:ipsec@13:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:ntp@3:openconnect@3:openvpn@4:ospf@2:pim@1:policy@8:pppoe-server@11:pptp@5:qos@2:quagga@11:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@2:sstp@6:system@29:vrf@3:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 1.5-stream-2025-Q2
